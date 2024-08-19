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

public val BoldGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 96.0f)
                close()
                moveTo(236.0f, 56.0f)
                lineTo(236.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(40.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 36.0f)
                lineTo(216.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 56.0f)
                close()
                moveTo(44.0f, 60.0f)
                verticalLineToRelative(79.72f)
                lineToRelative(33.86f, -33.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.28f, 0.0f)
                lineTo(147.31f, 147.0f)
                lineToRelative(17.18f, -17.17f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.28f, 0.0f)
                lineTo(212.0f, 149.09f)
                lineTo(212.0f, 60.0f)
                close()
                moveTo(44.0f, 196.0f)
                lineTo(162.34f, 196.0f)
                lineTo(92.0f, 125.66f)
                lineToRelative(-48.0f, 48.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(212.0f, 183.0f)
                lineToRelative(-33.37f, -33.37f)
                lineTo(164.28f, 164.0f)
                lineToRelative(32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
