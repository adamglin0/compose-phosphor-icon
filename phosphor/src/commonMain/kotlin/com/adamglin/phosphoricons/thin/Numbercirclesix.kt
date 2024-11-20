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

public val ThinGroup.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) {
            return _numberCircleSix!!
        }
        _numberCircleSix = Builder(name = "NumberCircleSix", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(128.0f, 116.0f)
                arcToRelative(32.08f, 32.08f, 0.0f, false, false, -9.75f, 1.52f)
                lineToRelative(21.18f, -35.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.86f, -4.1f)
                lineToRelative(-32.24f, 54.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 128.0f, 116.0f)
                close()
                moveTo(128.0f, 172.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 172.0f)
                close()
            }
        }
        .build()
        return _numberCircleSix!!
    }

private var _numberCircleSix: ImageVector? = null
