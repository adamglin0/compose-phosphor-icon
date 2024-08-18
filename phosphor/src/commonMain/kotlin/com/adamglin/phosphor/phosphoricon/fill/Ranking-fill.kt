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

public val FillGroup.`Ranking-fill`: ImageVector
    get() {
        if (`_ranking-fill` != null) {
            return `_ranking-fill`!!
        }
        `_ranking-fill` = Builder(name = "Ranking-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 200.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(232.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(176.0f, 128.0f)
                lineTo(176.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(96.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 80.0f, 56.0f)
                lineTo(80.0f, 88.0f)
                lineTo(40.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                lineTo(16.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(80.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 104.0f)
                lineTo(80.0f, 104.0f)
                close()
                moveTo(140.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(124.0f, 107.1f)
                lineToRelative(-1.47f, 0.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.06f, -15.18f)
                lineToRelative(12.0f, -4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 140.0f, 96.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(176.0f, 200.0f)
                lineTo(176.0f, 144.0f)
                horizontalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return `_ranking-fill`!!
    }

private var `_ranking-fill`: ImageVector? = null
