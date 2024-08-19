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

public val ThinGroup.Cellsignalfull: ImageVector
    get() {
        if (_cellsignalfull != null) {
            return _cellsignalfull!!
        }
        _cellsignalfull = Builder(name = "Cellsignalfull", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 72.0f)
                lineTo(164.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(156.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(200.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(196.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(204.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 200.0f, 28.0f)
                close()
                moveTo(120.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(124.0f, 112.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 120.0f, 108.0f)
                close()
                moveTo(80.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(84.0f, 152.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 80.0f, 148.0f)
                close()
                moveTo(40.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 188.0f)
                close()
            }
        }
        .build()
        return _cellsignalfull!!
    }

private var _cellsignalfull: ImageVector? = null
