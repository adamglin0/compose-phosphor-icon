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

public val ThinGroup.Megaphonesimple: ImageVector
    get() {
        if (_megaphonesimple != null) {
            return _megaphonesimple!!
        }
        _megaphonesimple = Builder(name = "Megaphonesimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.41f, 90.5f)
                lineToRelative(-176.0f, -54.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.41f, 12.41f, 0.0f, false, false, 3.45f, -0.5f)
                lineTo(140.0f, 176.32f)
                lineTo(140.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(196.0f, 159.14f)
                lineToRelative(31.39f, -9.63f)
                arcTo(12.06f, 12.06f, 0.0f, false, false, 236.0f, 138.0f)
                lineTo(236.0f, 102.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 227.41f, 90.5f)
                close()
                moveTo(49.12f, 195.84f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 192.0f)
                lineTo(44.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.6f, -3.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 48.0f, 44.0f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, true, 1.07f, 0.15f)
                lineTo(140.0f, 72.05f)
                lineTo(140.0f, 168.0f)
                close()
                moveTo(188.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(152.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(148.0f, 173.87f)
                lineToRelative(40.0f, -12.27f)
                close()
                moveTo(228.0f, 138.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.88f, 3.84f)
                lineToRelative(-0.05f, 0.0f)
                lineTo(148.0f, 165.5f)
                verticalLineToRelative(-91.0f)
                lineToRelative(77.12f, 23.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 102.0f)
                close()
            }
        }
        .build()
        return _megaphonesimple!!
    }

private var _megaphonesimple: ImageVector? = null
