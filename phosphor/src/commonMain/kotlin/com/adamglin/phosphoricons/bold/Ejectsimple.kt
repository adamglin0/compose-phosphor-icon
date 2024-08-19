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

public val BoldGroup.Ejectsimple: ImageVector
    get() {
        if (_ejectsimple != null) {
            return _ejectsimple!!
        }
        _ejectsimple = Builder(name = "Ejectsimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -24.0f)
                horizontalLineTo(224.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 200.0f)
                close()
                moveTo(22.0f, 152.57f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 2.52f, -21.32f)
                lineTo(106.16f, 30.43f)
                arcToRelative(28.08f, 28.08f, 0.0f, false, true, 43.68f, 0.0f)
                lineToRelative(81.65f, 100.82f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 215.91f, 164.0f)
                horizontalLineTo(40.09f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 22.0f, 152.57f)
                close()
                moveTo(48.3f, 140.0f)
                horizontalLineTo(207.7f)
                lineTo(131.2f, 45.53f)
                arcToRelative(4.11f, 4.11f, 0.0f, false, false, -6.4f, 0.0f)
                close()
            }
        }
        .build()
        return _ejectsimple!!
    }

private var _ejectsimple: ImageVector? = null
