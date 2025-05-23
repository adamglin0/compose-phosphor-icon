package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) {
            return _checkerboard!!
        }
        _checkerboard = Builder(name = "Checkerboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                close()
                moveTo(193.0f, 116.0f)
                lineTo(140.0f, 63.0f)
                lineTo(140.0f, 52.0f)
                horizontalLineToRelative(11.0f)
                lineToRelative(53.0f, 53.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(140.0f, 97.0f)
                lineToRelative(19.0f, 19.0f)
                lineTo(140.0f, 116.0f)
                close()
                moveTo(204.0f, 71.0f)
                lineTo(185.0f, 52.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(116.0f, 52.0f)
                lineTo(116.0f, 68.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(48.0f)
                lineTo(52.0f, 116.0f)
                lineTo(52.0f, 52.0f)
                close()
                moveTo(105.0f, 204.0f)
                lineTo(52.0f, 151.0f)
                lineTo(52.0f, 140.0f)
                lineTo(63.0f, 140.0f)
                lineToRelative(53.0f, 53.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(116.0f, 159.0f)
                lineTo(97.0f, 140.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(52.0f, 185.0f)
                lineToRelative(19.0f, 19.0f)
                lineTo(52.0f, 204.0f)
                close()
                moveTo(140.0f, 204.0f)
                lineTo(140.0f, 188.0f)
                horizontalLineToRelative(0.0f)
                lineTo(140.0f, 140.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _checkerboard!!
    }

private var _checkerboard: ImageVector? = null
