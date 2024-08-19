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

public val BoldGroup.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 196.0f, 136.0f)
                close()
                moveTo(236.0f, 100.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(60.0f, 212.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(28.0f, 60.92f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 60.0f, 28.0f)
                lineTo(192.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(60.0f, 52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.26f)
                verticalLineToRelative(0.08f)
                arcTo(8.32f, 8.32f, 0.0f, false, false, 60.48f, 68.0f)
                lineTo(204.0f, 68.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 236.0f, 100.0f)
                close()
                moveTo(212.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(60.48f, 92.0f)
                arcTo(33.72f, 33.72f, 0.0f, false, true, 52.0f, 90.92f)
                lineTo(52.0f, 180.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(204.0f, 188.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null
