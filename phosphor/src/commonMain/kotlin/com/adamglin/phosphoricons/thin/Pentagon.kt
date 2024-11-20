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

public val ThinGroup.Pentagon: ImageVector
    get() {
        if (_pentagon != null) {
            return _pentagon!!
        }
        _pentagon = Builder(name = "Pentagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.14f, 90.74f)
                lineTo(135.19f, 22.4f)
                lineToRelative(-0.09f, -0.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.19f, 0.0f)
                lineToRelative(-0.09f, 0.07f)
                lineTo(32.87f, 90.74f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.57f, 104.0f)
                lineToRelative(32.0f, 107.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 72.0f, 220.0f)
                lineTo(184.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.44f, -8.41f)
                lineToRelative(32.0f, -107.53f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 223.14f, 90.74f)
                close()
                moveTo(219.78f, 101.74f)
                lineTo(187.78f, 209.28f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 184.0f, 212.0f)
                lineTo(72.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.79f, -2.69f)
                lineToRelative(-32.0f, -107.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.44f, -4.45f)
                lineToRelative(0.09f, -0.07f)
                lineToRelative(87.94f, -68.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.65f, 0.0f)
                lineToRelative(87.94f, 68.33f)
                lineToRelative(0.09f, 0.07f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 219.78f, 101.69f)
                close()
            }
        }
        .build()
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
