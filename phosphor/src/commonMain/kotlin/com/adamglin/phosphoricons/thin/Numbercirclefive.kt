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

public val ThinGroup.Numbercirclefive: ImageVector
    get() {
        if (_numbercirclefive != null) {
            return _numbercirclefive!!
        }
        _numbercirclefive = Builder(name = "Numbercirclefive", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(115.39f, 84.0f)
                lineToRelative(-5.87f, 35.21f)
                arcTo(33.26f, 33.26f, 0.0f, false, true, 124.0f, 116.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                arcToRelative(31.62f, 31.62f, 0.0f, false, true, -22.86f, -9.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.72f, -5.6f)
                arcTo(23.67f, 23.67f, 0.0f, false, false, 124.0f, 172.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f)
                arcToRelative(23.67f, 23.67f, 0.0f, false, false, -17.14f, 6.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.81f, -3.46f)
                lineToRelative(8.0f, -48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 112.0f, 76.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
            }
        }
        .build()
        return _numbercirclefive!!
    }

private var _numbercirclefive: ImageVector? = null
