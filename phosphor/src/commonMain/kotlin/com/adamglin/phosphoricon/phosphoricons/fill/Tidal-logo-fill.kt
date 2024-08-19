package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Tidal-logo-fill`: ImageVector
    get() {
        if (`_tidal-logo-fill` != null) {
            return `_tidal-logo-fill`!!
        }
        `_tidal-logo-fill` = Builder(name = "Tidal-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.66f, 101.66f)
                lineToRelative(-36.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-36.0f, -36.0f)
                lineToRelative(-0.34f, -0.38f)
                lineToRelative(-0.34f, 0.38f)
                lineTo(135.31f, 136.0f)
                lineToRelative(34.35f, 34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-36.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-36.0f, -36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineTo(120.69f, 136.0f)
                lineTo(86.34f, 101.66f)
                lineToRelative(-0.34f, -0.38f)
                lineToRelative(-0.34f, 0.38f)
                lineToRelative(-36.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-36.0f, -36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineToRelative(36.0f, -36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(36.0f, 36.0f)
                lineToRelative(0.34f, 0.38f)
                lineToRelative(0.34f, -0.38f)
                lineToRelative(36.0f, -36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(36.0f, 36.0f)
                lineToRelative(0.34f, 0.38f)
                lineToRelative(0.34f, -0.38f)
                lineToRelative(36.0f, -36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(36.0f, 36.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 253.66f, 101.66f)
                close()
            }
        }
        .build()
        return `_tidal-logo-fill`!!
    }

private var `_tidal-logo-fill`: ImageVector? = null
