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

public val LightGroup.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = Builder(name = "Money", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 166.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -38.0f, -38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 128.0f, 166.0f)
                close()
                moveTo(128.0f, 102.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 102.0f)
                close()
                moveTo(240.0f, 58.0f)
                lineTo(16.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(10.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(240.0f, 198.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(246.0f, 64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 240.0f, 58.0f)
                close()
                moveTo(22.0f, 108.82f)
                arcTo(54.73f, 54.73f, 0.0f, false, false, 60.82f, 70.0f)
                lineTo(195.18f, 70.0f)
                arcTo(54.73f, 54.73f, 0.0f, false, false, 234.0f, 108.82f)
                verticalLineToRelative(38.36f)
                arcTo(54.73f, 54.73f, 0.0f, false, false, 195.18f, 186.0f)
                lineTo(60.82f, 186.0f)
                arcTo(54.73f, 54.73f, 0.0f, false, false, 22.0f, 147.18f)
                close()
                moveTo(234.0f, 96.29f)
                arcTo(42.8f, 42.8f, 0.0f, false, true, 207.71f, 70.0f)
                lineTo(234.0f, 70.0f)
                close()
                moveTo(48.29f, 70.0f)
                arcTo(42.8f, 42.8f, 0.0f, false, true, 22.0f, 96.29f)
                lineTo(22.0f, 70.0f)
                close()
                moveTo(22.0f, 159.71f)
                arcTo(42.8f, 42.8f, 0.0f, false, true, 48.29f, 186.0f)
                lineTo(22.0f, 186.0f)
                close()
                moveTo(207.71f, 186.0f)
                arcTo(42.8f, 42.8f, 0.0f, false, true, 234.0f, 159.71f)
                lineTo(234.0f, 186.0f)
                close()
            }
        }
        .build()
        return _money!!
    }

private var _money: ImageVector? = null
