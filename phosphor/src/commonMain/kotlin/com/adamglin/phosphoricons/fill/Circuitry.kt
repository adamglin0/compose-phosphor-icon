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

public val FillGroup.Circuitry: ImageVector
    get() {
        if (_circuitry != null) {
            return _circuitry!!
        }
        _circuitry = Builder(name = "Circuitry", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 111.31f)
                lineToRelative(48.0f, 48.0f)
                lineTo(136.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(68.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(72.0f, 153.38f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 16.0f, 0.0f)
                close()
                moveTo(80.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 184.0f)
                close()
                moveTo(184.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 104.0f)
                close()
                moveTo(208.0f, 32.0f)
                lineTo(156.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(152.0f, 68.69f)
                lineToRelative(13.66f, 13.66f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -11.31f, 11.31f)
                lineToRelative(-16.0f, -16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 72.0f)
                lineTo(136.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(92.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(88.0f, 88.69f)
                lineToRelative(61.66f, 61.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 156.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
            }
        }
        .build()
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
