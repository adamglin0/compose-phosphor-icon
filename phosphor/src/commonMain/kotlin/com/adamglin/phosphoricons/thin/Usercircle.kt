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

public val ThinGroup.Usercircle: ImageVector
    get() {
        if (_usercircle != null) {
            return _usercircle!!
        }
        _usercircle = Builder(name = "Usercircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(68.87f, 198.42f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 118.26f, 0.0f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, -118.26f, 0.0f)
                close()
                moveTo(193.17f, 192.87f)
                arcToRelative(75.61f, 75.61f, 0.0f, false, false, -44.51f, -34.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -41.32f, 0.0f)
                arcToRelative(75.61f, 75.61f, 0.0f, false, false, -44.51f, 34.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 130.34f, 0.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 156.0f)
                close()
            }
        }
        .build()
        return _usercircle!!
    }

private var _usercircle: ImageVector? = null
