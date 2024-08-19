package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Phosphorlogo: ImageVector
    get() {
        if (_phosphorlogo != null) {
            return _phosphorlogo!!
        }
        _phosphorlogo = Builder(name = "Phosphorlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 32.0f)
                lineTo(72.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(64.0f, 168.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, false, 80.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(152.0f, 176.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, -144.0f)
                close()
                moveTo(80.0f, 70.54f)
                lineTo(130.32f, 160.0f)
                lineTo(80.0f, 160.0f)
                close()
                moveTo(136.0f, 137.46f)
                lineTo(85.68f, 48.0f)
                lineTo(136.0f, 48.0f)
                close()
                moveTo(80.51f, 176.0f)
                lineTo(136.0f, 176.0f)
                verticalLineToRelative(55.5f)
                arcTo(64.14f, 64.14f, 0.0f, false, true, 80.51f, 176.0f)
                close()
                moveTo(152.0f, 160.0f)
                lineTo(152.0f, 48.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 0.0f, 112.0f)
                close()
            }
        }
        .build()
        return _phosphorlogo!!
    }

private var _phosphorlogo: ImageVector? = null
