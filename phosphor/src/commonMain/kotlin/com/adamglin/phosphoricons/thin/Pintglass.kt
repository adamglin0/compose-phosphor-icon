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

public val ThinGroup.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) {
            return _pintGlass!!
        }
        _pintGlass = Builder(name = "PintGlass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(203.0f, 29.35f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 200.0f, 28.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.48f)
                lineToRelative(23.15f, 193.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 87.1f, 236.0f)
                horizontalLineToRelative(81.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.92f, -10.57f)
                lineTo(204.0f, 32.48f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 203.0f, 29.35f)
                close()
                moveTo(195.49f, 36.0f)
                lineToRelative(-3.84f, 32.0f)
                horizontalLineTo(64.35f)
                lineTo(60.51f, 36.0f)
                close()
                moveTo(172.87f, 224.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 3.52f)
                horizontalLineTo(87.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -3.52f)
                lineTo(65.31f, 76.0f)
                horizontalLineTo(190.69f)
                close()
            }
        }
        .build()
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null
