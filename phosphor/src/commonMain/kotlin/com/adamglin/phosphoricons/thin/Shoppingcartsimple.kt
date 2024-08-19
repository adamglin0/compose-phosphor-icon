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

public val ThinGroup.Shoppingcartsimple: ImageVector
    get() {
        if (_shoppingcartsimple != null) {
            return _shoppingcartsimple!!
        }
        _shoppingcartsimple = Builder(name = "Shoppingcartsimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.18f, 69.58f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 68.0f)
                lineTo(54.15f, 68.0f)
                lineTo(43.85f, 30.93f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 28.0f)
                lineTo(16.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(37.0f, 36.0f)
                lineTo(72.89f, 165.35f)
                arcTo(20.06f, 20.06f, 0.0f, false, false, 92.16f, 180.0f)
                lineTo(191.0f, 180.0f)
                arcToRelative(20.06f, 20.06f, 0.0f, false, false, 19.27f, -14.65f)
                lineToRelative(25.63f, -92.28f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 235.18f, 69.58f)
                close()
                moveTo(202.51f, 163.21f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 191.0f, 172.0f)
                lineTo(92.16f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.56f, -8.79f)
                lineTo(56.37f, 76.0f)
                lineTo(226.74f, 76.0f)
                close()
                moveTo(100.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 216.0f)
                close()
                moveTo(204.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 216.0f)
                close()
            }
        }
        .build()
        return _shoppingcartsimple!!
    }

private var _shoppingcartsimple: ImageVector? = null
