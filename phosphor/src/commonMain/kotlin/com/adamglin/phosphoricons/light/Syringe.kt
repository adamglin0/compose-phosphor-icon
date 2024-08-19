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

public val LightGroup.Syringe: ImageVector
    get() {
        if (_syringe != null) {
            return _syringe!!
        }
        _syringe = Builder(name = "Syringe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.24f, 67.76f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(199.51f, 48.0f)
                lineTo(168.0f, 79.51f)
                lineTo(132.24f, 43.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, 8.48f)
                lineTo(131.51f, 60.0f)
                lineTo(46.1f, 145.41f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -4.1f, 9.9f)
                verticalLineToRelative(50.2f)
                lineTo(19.76f, 227.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineTo(50.49f, 214.0f)
                horizontalLineToRelative(50.2f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, -4.1f)
                lineTo(196.0f, 124.49f)
                lineToRelative(7.76f, 7.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(176.49f, 88.0f)
                lineTo(208.0f, 56.49f)
                lineToRelative(19.76f, 19.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                close()
                moveTo(102.1f, 201.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, 0.59f)
                horizontalLineTo(54.0f)
                verticalLineTo(155.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.59f, -1.41f)
                lineTo(74.0f, 134.49f)
                lineToRelative(21.76f, 21.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, -8.48f)
                lineTo(82.49f, 126.0f)
                lineTo(98.0f, 110.49f)
                lineToRelative(21.76f, 21.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(106.49f, 102.0f)
                lineTo(140.0f, 68.49f)
                lineTo(187.51f, 116.0f)
                close()
            }
        }
        .build()
        return _syringe!!
    }

private var _syringe: ImageVector? = null
