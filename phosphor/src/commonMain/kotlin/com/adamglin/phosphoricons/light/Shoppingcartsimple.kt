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

public val LightGroup.Shoppingcartsimple: ImageVector
    get() {
        if (_shoppingcartsimple != null) {
            return _shoppingcartsimple!!
        }
        _shoppingcartsimple = Builder(name = "Shoppingcartsimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.78f, 68.37f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 66.0f)
                lineTo(55.67f, 66.0f)
                lineTo(45.78f, 30.39f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 26.0f)
                lineTo(16.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(35.44f, 38.0f)
                lineTo(71.0f, 165.89f)
                arcTo(22.08f, 22.08f, 0.0f, false, false, 92.16f, 182.0f)
                lineTo(191.0f, 182.0f)
                arcToRelative(22.08f, 22.08f, 0.0f, false, false, 21.2f, -16.11f)
                lineToRelative(25.63f, -92.28f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 236.78f, 68.37f)
                close()
                moveTo(200.58f, 162.68f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 191.0f, 170.0f)
                lineTo(92.16f, 170.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -9.63f, -7.32f)
                lineTo(59.0f, 78.0f)
                lineTo(224.11f, 78.0f)
                close()
                moveTo(102.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 102.0f, 216.0f)
                close()
                moveTo(206.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 206.0f, 216.0f)
                close()
            }
        }
        .build()
        return _shoppingcartsimple!!
    }

private var _shoppingcartsimple: ImageVector? = null
