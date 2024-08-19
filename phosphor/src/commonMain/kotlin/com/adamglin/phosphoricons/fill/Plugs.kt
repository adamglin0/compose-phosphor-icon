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

public val FillGroup.Plugs: ImageVector
    get() {
        if (_plugs != null) {
            return _plugs!!
        }
        _plugs = Builder(name = "Plugs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.66f, 149.66f)
                lineTo(131.31f, 168.0f)
                lineToRelative(18.35f, 18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(132.0f, 191.31f)
                lineToRelative(-23.31f, 23.32f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, true, -45.26f, 0.0f)
                lineToRelative(-5.37f, -5.38f)
                lineToRelative(-28.4f, 28.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(28.41f, -28.4f)
                lineToRelative(-5.38f, -5.37f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -45.26f)
                lineTo(64.69f, 124.0f)
                lineToRelative(-6.35f, -6.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(88.0f, 124.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(99.31f, 136.0f)
                lineTo(120.0f, 156.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
                moveTo(237.66f, 18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-28.4f, 28.41f)
                lineToRelative(-5.37f, -5.38f)
                arcToRelative(32.05f, 32.05f, 0.0f, false, false, -45.26f, 0.0f)
                lineTo(124.0f, 64.69f)
                lineToRelative(-6.34f, -6.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(191.31f, 132.0f)
                lineToRelative(23.32f, -23.31f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -45.26f)
                lineToRelative(-5.38f, -5.37f)
                lineToRelative(28.41f, -28.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 18.34f)
                close()
            }
        }
        .build()
        return _plugs!!
    }

private var _plugs: ImageVector? = null
