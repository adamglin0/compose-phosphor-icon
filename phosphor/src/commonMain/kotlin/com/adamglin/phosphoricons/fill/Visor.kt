package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Visor: ImageVector
    get() {
        if (_visor != null) {
            return _visor!!
        }
        _visor = Builder(name = "Visor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.05f, 56.0f)
                horizontalLineTo(72.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 0.08f, 131.4f)
                curveToRelative(1.69f, 36.69f, 31.76f, 66.79f, 68.45f, 68.52f)
                curveToRelative(15.84f, 0.72f, 32.0f, -5.9f, 49.38f, -20.3f)
                arcToRelative(15.87f, 15.87f, 0.0f, false, true, 20.24f, 0.0f)
                curveTo(148.72f, 188.39f, 165.0f, 200.0f, 184.0f, 200.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 72.0f, -72.95f)
                curveTo(255.49f, 87.87f, 222.76f, 56.0f, 183.05f, 56.0f)
                close()
                moveTo(176.0f, 104.0f)
                horizontalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _visor!!
    }

private var _visor: ImageVector? = null
