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

public val ThinGroup.Gendermale: ImageVector
    get() {
        if (_gendermale != null) {
            return _gendermale!!
        }
        _gendermale = Builder(name = "Gendermale", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                horizontalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(38.35f)
                lineTo(154.82f, 95.52f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, 5.66f, 5.66f)
                lineTo(212.0f, 49.66f)
                verticalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(152.07f, 200.11f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 0.0f, -96.18f)
                arcTo(68.08f, 68.08f, 0.0f, false, true, 152.07f, 200.11f)
                close()
            }
        }
        .build()
        return _gendermale!!
    }

private var _gendermale: ImageVector? = null
