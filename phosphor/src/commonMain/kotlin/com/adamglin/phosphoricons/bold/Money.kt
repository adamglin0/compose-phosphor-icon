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

public val BoldGroup.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = Builder(name = "Money", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 52.0f)
                lineTo(16.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 4.0f, 64.0f)
                lineTo(4.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(240.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(252.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.0f, 52.0f)
                close()
                moveTo(181.21f, 180.0f)
                lineTo(74.79f, 180.0f)
                arcTo(60.18f, 60.18f, 0.0f, false, false, 28.0f, 133.21f)
                lineTo(28.0f, 122.79f)
                arcTo(60.18f, 60.18f, 0.0f, false, false, 74.79f, 76.0f)
                lineTo(181.21f, 76.0f)
                arcTo(60.18f, 60.18f, 0.0f, false, false, 228.0f, 122.79f)
                verticalLineToRelative(10.42f)
                arcTo(60.18f, 60.18f, 0.0f, false, false, 181.21f, 180.0f)
                close()
                moveTo(228.0f, 97.94f)
                arcTo(36.23f, 36.23f, 0.0f, false, true, 206.06f, 76.0f)
                lineTo(228.0f, 76.0f)
                close()
                moveTo(49.94f, 76.0f)
                arcTo(36.23f, 36.23f, 0.0f, false, true, 28.0f, 97.94f)
                lineTo(28.0f, 76.0f)
                close()
                moveTo(28.0f, 158.06f)
                arcTo(36.23f, 36.23f, 0.0f, false, true, 49.94f, 180.0f)
                lineTo(28.0f, 180.0f)
                close()
                moveTo(206.06f, 180.0f)
                arcTo(36.23f, 36.23f, 0.0f, false, true, 228.0f, 158.06f)
                lineTo(228.0f, 180.0f)
                close()
                moveTo(128.0f, 88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 128.0f, 88.0f)
                close()
                moveTo(128.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 144.0f)
                close()
            }
        }
        .build()
        return _money!!
    }

private var _money: ImageVector? = null
