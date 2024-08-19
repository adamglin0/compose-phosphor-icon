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

public val ThinGroup.Usercirclecheck: ImageVector
    get() {
        if (_usercirclecheck != null) {
            return _usercirclecheck!!
        }
        _usercirclecheck = Builder(name = "Usercirclecheck", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 108.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.28f, 4.61f)
                arcTo(93.4f, 93.4f, 0.0f, false, true, 220.0f, 128.0f)
                arcToRelative(91.71f, 91.71f, 0.0f, false, true, -26.83f, 64.87f)
                arcToRelative(75.61f, 75.61f, 0.0f, false, false, -44.51f, -34.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -41.32f, 0.0f)
                arcToRelative(75.61f, 75.61f, 0.0f, false, false, -44.51f, 34.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 36.0f)
                arcToRelative(93.4f, 93.4f, 0.0f, false, true, 15.34f, 1.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.32f, -7.89f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcToRelative(101.78f, 101.78f, 0.0f, false, false, -1.38f, -16.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 222.0f, 108.05f)
                close()
                moveTo(92.0f, 120.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 120.0f)
                close()
                moveTo(68.87f, 198.42f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 118.26f, 0.0f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, -118.26f, 0.0f)
                close()
                moveTo(234.87f, 42.83f)
                lineTo(202.87f, 74.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(200.0f, 66.34f)
                lineToRelative(29.17f, -29.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                close()
            }
        }
        .build()
        return _usercirclecheck!!
    }

private var _usercirclecheck: ImageVector? = null
