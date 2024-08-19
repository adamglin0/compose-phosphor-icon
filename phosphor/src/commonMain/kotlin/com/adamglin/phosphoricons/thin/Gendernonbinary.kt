package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Gendernonbinary: ImageVector
    get() {
        if (_gendernonbinary != null) {
            return _gendernonbinary!!
        }
        _gendernonbinary = Builder(name = "Gendernonbinary", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 100.13f)
                verticalLineTo(55.07f)
                lineToRelative(33.94f, 20.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.12f, -6.86f)
                lineTo(135.77f, 48.0f)
                lineToRelative(34.29f, -20.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.12f, -6.86f)
                lineTo(128.0f, 43.34f)
                lineTo(90.06f, 20.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.12f, 6.86f)
                lineTo(120.23f, 48.0f)
                lineTo(85.94f, 68.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.12f, 6.86f)
                lineTo(124.0f, 55.07f)
                verticalLineToRelative(45.06f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, 8.0f, 0.0f)
                close()
                moveTo(128.0f, 228.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 60.0f, -60.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, true, 128.0f, 228.0f)
                close()
            }
        }
        .build()
        return _gendernonbinary!!
    }

private var _gendernonbinary: ImageVector? = null
