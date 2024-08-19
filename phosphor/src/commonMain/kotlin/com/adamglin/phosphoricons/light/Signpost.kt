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

public val LightGroup.Signpost: ImageVector
    get() {
        if (_signpost != null) {
            return _signpost!!
        }
        _signpost = Builder(name = "Signpost", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.46f, 108.0f)
                lineTo(210.84f, 70.63f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.44f, 66.0f)
                lineTo(134.0f, 66.0f)
                lineTo(134.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 66.0f)
                lineTo(40.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 80.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(82.0f)
                verticalLineToRelative(66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 158.0f)
                horizontalLineToRelative(66.44f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.4f, -4.63f)
                lineTo(244.46f, 116.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 244.46f, 108.0f)
                close()
                moveTo(201.92f, 145.35f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.48f, 0.66f)
                lineTo(40.0f, 146.01f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(200.44f, 78.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.48f, 0.66f)
                lineToRelative(30.0f, 33.34f)
                close()
            }
        }
        .build()
        return _signpost!!
    }

private var _signpost: ImageVector? = null
