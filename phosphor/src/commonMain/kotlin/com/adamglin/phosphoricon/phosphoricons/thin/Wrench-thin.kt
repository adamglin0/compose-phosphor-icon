package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Wrench-thin`: ImageVector
    get() {
        if (`_wrench-thin` != null) {
            return `_wrench-thin`!!
        }
        `_wrench-thin` = Builder(name = "Wrench-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.05f, 70.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.42f, -1.44f)
                lineToRelative(-41.82f, 38.6f)
                lineTo(153.0f, 103.0f)
                lineToRelative(-4.68f, -21.79f)
                lineToRelative(38.6f, -41.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.44f, -6.43f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 98.94f, 126.0f)
                lineTo(36.4f, 180.0f)
                lineToRelative(-0.21f, 0.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 39.6f)
                lineToRelative(0.2f, -0.21f)
                lineToRelative(54.0f, -62.54f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 228.0f, 96.0f)
                arcTo(67.51f, 67.51f, 0.0f, false, false, 223.05f, 70.5f)
                close()
                moveTo(160.0f, 156.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -29.0f, -7.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, 0.89f)
                lineTo(70.0f, 214.25f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 41.75f, 186.0f)
                lineToRelative(64.82f, -56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.89f, -5.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 69.46f, -86.59f)
                lineTo(141.05f, 77.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.0f, 3.55f)
                lineToRelative(5.66f, 26.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.07f, 3.07f)
                lineToRelative(26.35f, 5.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.55f, -1.0f)
                lineToRelative(38.87f, -35.87f)
                arcTo(60.05f, 60.05f, 0.0f, false, true, 160.0f, 156.0f)
                close()
            }
        }
        .build()
        return `_wrench-thin`!!
    }

private var `_wrench-thin`: ImageVector? = null
