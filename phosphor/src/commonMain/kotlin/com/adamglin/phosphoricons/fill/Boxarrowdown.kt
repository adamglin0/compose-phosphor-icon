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

public val FillGroup.Boxarrowdown: ImageVector
    get() {
        if (_boxarrowdown != null) {
            return _boxarrowdown!!
        }
        _boxarrowdown = Builder(name = "Boxarrowdown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.16f, 68.42f)
                lineToRelative(-16.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 32.0f)
                lineTo(56.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 4.42f)
                lineToRelative(-16.0f, 32.0f)
                arcTo(8.08f, 8.08f, 0.0f, false, false, 32.0f, 72.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 72.0f)
                arcTo(8.08f, 8.08f, 0.0f, false, false, 223.16f, 68.42f)
                close()
                moveTo(165.66f, 157.66f)
                lineTo(133.66f, 189.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(120.0f, 164.69f)
                lineTo(120.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(60.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
                moveTo(52.94f, 64.0f)
                lineToRelative(8.0f, -16.0f)
                lineTo(195.06f, 48.0f)
                lineToRelative(8.0f, 16.0f)
                close()
            }
        }
        .build()
        return _boxarrowdown!!
    }

private var _boxarrowdown: ImageVector? = null
