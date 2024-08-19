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

public val BoldGroup.Circuitry: ImageVector
    get() {
        if (_circuitry != null) {
            return _circuitry!!
        }
        _circuitry = Builder(name = "Circuitry", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                horizontalLineTo(48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(52.0f, 52.0f)
                horizontalLineTo(76.0f)
                verticalLineToRelative(95.22f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 0.0f)
                verticalLineTo(125.0f)
                lineToRelative(40.0f, 40.0f)
                verticalLineToRelative(39.0f)
                horizontalLineTo(52.0f)
                close()
                moveTo(204.0f, 204.0f)
                horizontalLineTo(164.0f)
                verticalLineTo(160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.51f, -8.49f)
                lineTo(100.0f, 91.0f)
                verticalLineTo(52.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.51f, 8.49f)
                lineToRelative(17.31f, 17.3f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 17.0f, -17.0f)
                lineTo(148.0f, 67.0f)
                verticalLineTo(52.0f)
                horizontalLineToRelative(56.0f)
                close()
            }
        }
        .build()
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
