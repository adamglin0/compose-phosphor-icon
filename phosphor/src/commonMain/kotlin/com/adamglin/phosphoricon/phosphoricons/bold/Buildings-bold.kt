package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Buildings-bold`: ImageVector
    get() {
        if (`_buildings-bold` != null) {
            return `_buildings-bold`!!
        }
        `_buildings-bold` = Builder(name = "Buildings-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 204.0f)
                lineTo(228.0f, 204.0f)
                lineTo(228.0f, 96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(172.0f, 76.0f)
                lineTo(172.0f, 32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.45f, -18.12f)
                lineToRelative(-104.0f, 48.54f)
                arcTo(20.06f, 20.06f, 0.0f, false, false, 28.0f, 80.55f)
                lineTo(28.0f, 204.0f)
                lineTo(16.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(240.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(204.0f, 100.0f)
                lineTo(204.0f, 204.0f)
                lineTo(172.0f, 204.0f)
                lineTo(172.0f, 100.0f)
                close()
                moveTo(52.0f, 83.09f)
                lineTo(148.0f, 38.3f)
                lineTo(148.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                close()
                moveTo(132.0f, 112.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(108.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(92.0f, 112.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(68.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(92.0f, 164.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(68.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(132.0f, 164.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(108.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_buildings-bold`!!
    }

private var `_buildings-bold`: ImageVector? = null
