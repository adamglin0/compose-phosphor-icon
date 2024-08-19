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

public val FillGroup.`Club-fill`: ImageVector
    get() {
        if (`_club-fill` != null) {
            return `_club-fill`!!
        }
        `_club-fill` = Builder(name = "Club-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 144.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -84.81f, 48.0f)
                horizontalLineToRelative(-4.44f)
                lineToRelative(8.91f, 29.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 232.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.66f, -10.3f)
                lineToRelative(8.91f, -29.7f)
                horizontalLineToRelative(-4.44f)
                arcTo(56.0f, 56.0f, 0.0f, true, true, 72.0f, 88.0f)
                curveToRelative(0.78f, 0.0f, 1.55f, 0.0f, 2.33f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 107.34f, 0.0f)
                curveToRelative(0.77f, 0.0f, 1.55f, 0.0f, 2.33f, 0.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 240.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_club-fill`!!
    }

private var `_club-fill`: ImageVector? = null
