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

public val FillGroup.`Campfire-fill`: ImageVector
    get() {
        if (`_campfire-fill` != null) {
            return `_campfire-fill`!!
        }
        `_campfire-fill` = Builder(name = "Campfire-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.19f, 25.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.38f, 0.0f)
                arcTo(156.0f, 156.0f, 0.0f, false, false, 96.24f, 48.0f)
                curveTo(77.77f, 67.13f, 68.0f, 87.9f, 68.0f, 108.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 120.0f, 0.0f)
                curveTo(188.0f, 60.08f, 134.47f, 26.59f, 132.19f, 25.19f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                curveToRelative(0.0f, -24.0f, 24.0f, -40.0f, 24.0f, -40.0f)
                reflectiveCurveToRelative(24.0f, 16.0f, 24.0f, 40.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 152.0f)
                close()
                moveTo(223.62f, 226.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.05f, 5.2f)
                lineTo(128.0f, 204.39f)
                lineTo(42.43f, 231.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -4.85f, -15.25f)
                lineToRelative(64.0f, -20.37f)
                lineToRelative(-64.0f, -20.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.85f, -15.24f)
                lineTo(128.0f, 187.6f)
                lineToRelative(85.57f, -27.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.85f, 15.24f)
                lineToRelative(-64.0f, 20.38f)
                lineToRelative(64.0f, 20.37f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 223.62f, 226.42f)
                close()
            }
        }
        .build()
        return `_campfire-fill`!!
    }

private var `_campfire-fill`: ImageVector? = null
