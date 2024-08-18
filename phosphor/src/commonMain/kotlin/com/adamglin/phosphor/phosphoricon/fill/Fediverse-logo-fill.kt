package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Fediverse-logo-fill`: ImageVector
    get() {
        if (`_fediverse-logo-fill` != null) {
            return `_fediverse-logo-fill`!!
        }
        `_fediverse-logo-fill` = Builder(name = "Fediverse-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 96.0f)
                arcToRelative(27.84f, 27.84f, 0.0f, false, false, -10.51f, 2.0f)
                lineTo(171.0f, 59.94f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 120.0f, 44.0f)
                arcToRelative(28.65f, 28.65f, 0.0f, false, false, 0.15f, 2.94f)
                lineTo(73.68f, 66.3f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.6f, 44.83f)
                lineToRelative(1.85f, 46.38f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 32.74f, 41.42f)
                lineTo(128.0f, 212.47f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 49.13f, -18.79f)
                lineToRelative(27.21f, -42.75f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 212.0f, 96.0f)
                close()
                moveTo(71.19f, 104.36f)
                lineTo(113.72f, 129.0f)
                lineTo(72.26f, 161.22f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -9.34f, -4.35f)
                lineToRelative(-1.85f, -46.38f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 71.19f, 104.36f)
                close()
                moveTo(149.57f, 72.0f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, false, 8.94f, -2.0f)
                lineTo(189.0f, 108.06f)
                arcToRelative(27.86f, 27.86f, 0.0f, false, false, -4.18f, 9.22f)
                lineToRelative(-46.57f, 2.22f)
                close()
                moveTo(82.09f, 173.85f)
                lineTo(124.0f, 141.26f)
                lineToRelative(15.94f, 47.83f)
                arcToRelative(28.2f, 28.2f, 0.0f, false, false, -7.6f, 8.0f)
                lineTo(84.0f, 183.53f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 82.09f, 173.85f)
                close()
                moveTo(156.0f, 184.0f)
                lineToRelative(-0.89f, 0.0f)
                lineToRelative(-16.18f, -48.53f)
                lineToRelative(46.65f, -2.22f)
                arcToRelative(27.94f, 27.94f, 0.0f, false, false, 5.28f, 9.0f)
                lineToRelative(-27.21f, 42.75f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 156.0f, 184.0f)
                close()
                moveTo(126.32f, 61.7f)
                arcTo(28.44f, 28.44f, 0.0f, false, false, 134.0f, 68.24f)
                lineToRelative(-11.3f, 47.45f)
                lineTo(79.23f, 90.52f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 80.0f, 84.0f)
                arcToRelative(28.65f, 28.65f, 0.0f, false, false, -0.15f, -2.94f)
                close()
            }
        }
        .build()
        return `_fediverse-logo-fill`!!
    }

private var `_fediverse-logo-fill`: ImageVector? = null
