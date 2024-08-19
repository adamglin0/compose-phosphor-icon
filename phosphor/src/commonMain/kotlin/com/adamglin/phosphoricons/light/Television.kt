package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Television: ImageVector
    get() {
        if (_television != null) {
            return _television!!
        }
        _television = Builder(name = "Television", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 66.0f)
                lineTo(142.48f, 66.0f)
                lineToRelative(37.76f, -37.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineTo(128.0f, 63.51f)
                lineTo(84.24f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, 8.48f)
                lineTo(113.52f, 66.0f)
                lineTo(40.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 80.0f)
                lineTo(26.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 80.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 66.0f)
                close()
                moveTo(38.0f, 200.0f)
                lineTo(38.0f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(146.0f, 78.0f)
                lineTo(146.0f, 202.0f)
                lineTo(40.0f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 200.0f)
                close()
                moveTo(218.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(158.0f, 202.0f)
                lineTo(158.0f, 78.0f)
                horizontalLineToRelative(58.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(198.0f, 116.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 198.0f, 116.0f)
                close()
                moveTo(198.0f, 164.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 198.0f, 164.0f)
                close()
            }
        }
        .build()
        return _television!!
    }

private var _television: ImageVector? = null
