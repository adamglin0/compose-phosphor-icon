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

public val ThinGroup.NumberEight: ImageVector
    get() {
        if (_numberEight != null) {
            return _numberEight!!
        }
        _numberEight = Builder(name = "NumberEight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.08f, 119.64f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -38.16f, 0.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 38.16f, 0.0f)
                close()
                moveTo(92.0f, 80.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 80.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, -44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
