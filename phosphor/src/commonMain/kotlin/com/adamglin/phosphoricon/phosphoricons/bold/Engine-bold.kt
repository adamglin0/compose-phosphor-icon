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

public val BoldGroup.`Engine-bold`: ImageVector
    get() {
        if (`_engine-bold` != null) {
            return `_engine-bold`!!
        }
        `_engine-bold` = Builder(name = "Engine-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 100.0f)
                lineTo(225.0f, 100.0f)
                lineTo(190.83f, 65.86f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 176.69f, 60.0f)
                lineTo(144.0f, 60.0f)
                lineTo(144.0f, 44.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(100.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(20.0f)
                lineTo(120.0f, 60.0f)
                lineTo(64.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 80.0f)
                verticalLineToRelative(48.0f)
                lineTo(28.0f, 128.0f)
                lineTo(28.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(28.0f, 152.0f)
                lineTo(44.0f, 152.0f)
                verticalLineToRelative(16.69f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 5.86f, 14.14f)
                lineToRelative(39.31f, 39.31f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 103.31f, 228.0f)
                horizontalLineToRelative(73.38f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.14f, -5.86f)
                lineTo(225.0f, 188.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(256.0f, 120.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 100.0f)
                close()
                moveTo(232.0f, 164.0f)
                lineTo(220.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 3.51f)
                lineTo(175.0f, 204.0f)
                lineTo(105.0f, 204.0f)
                lineTo(68.0f, 167.0f)
                lineTo(68.0f, 84.0f)
                lineTo(175.0f, 84.0f)
                lineToRelative(36.48f, 36.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 220.0f, 124.0f)
                horizontalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return `_engine-bold`!!
    }

private var `_engine-bold`: ImageVector? = null
