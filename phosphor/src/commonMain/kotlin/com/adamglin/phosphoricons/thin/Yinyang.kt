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

public val ThinGroup.YinYang: ImageVector
    get() {
        if (_yinYang != null) {
            return _yinYang!!
        }
        _yinYang = Builder(name = "YinYang", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(36.0f, 128.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, true, 92.0f, -92.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 0.0f, 88.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -37.44f, 88.0f)
                arcTo(92.14f, 92.14f, 0.0f, false, true, 36.0f, 128.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 0.0f, -88.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 37.44f, -88.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(136.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 176.0f)
                close()
                moveTo(120.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 80.0f)
                close()
            }
        }
        .build()
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
