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

public val LightGroup.Imagesquare: ImageVector
    get() {
        if (_imagesquare != null) {
            return _imagesquare!!
        }
        _imagesquare = Builder(name = "Imagesquare", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(46.0f, 208.0f)
                lineTo(46.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(82.2f)
                lineToRelative(-28.1f, -28.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(54.2f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f)
                close()
                moveTo(208.0f, 210.0f)
                lineTo(71.17f, 210.0f)
                lineToRelative(99.41f, -99.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineTo(210.0f, 147.17f)
                lineTo(210.0f, 208.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 210.0f)
                close()
                moveTo(96.0f, 118.0f)
                arcTo(22.0f, 22.0f, 0.0f, true, false, 74.0f, 96.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 96.0f, 118.0f)
                close()
                moveTo(96.0f, 86.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 86.0f, 96.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 96.0f, 86.0f)
                close()
            }
        }
        .build()
        return _imagesquare!!
    }

private var _imagesquare: ImageVector? = null
