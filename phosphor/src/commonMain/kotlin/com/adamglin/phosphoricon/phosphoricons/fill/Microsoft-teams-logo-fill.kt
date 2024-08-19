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

public val FillGroup.`Microsoft-teams-logo-fill`: ImageVector
    get() {
        if (`_microsoft-teams-logo-fill` != null) {
            return `_microsoft-teams-logo-fill`!!
        }
        `_microsoft-teams-logo-fill` = Builder(name = "Microsoft-teams-logo-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.26f, 80.0f)
                horizontalLineToRelative(-7.57f)
                arcTo(31.71f, 31.71f, 0.0f, false, false, 216.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.88f, -28.85f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 96.81f, 64.0f)
                lineTo(40.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(76.67f, 192.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 118.7f, -0.15f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 232.0f, 152.0f)
                lineTo(232.0f, 92.74f)
                arcTo(12.76f, 12.76f, 0.0f, false, false, 219.26f, 80.0f)
                close()
                moveTo(136.0f, 32.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 15.07f, 42.68f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 136.0f, 64.0f)
                lineTo(113.38f, 64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 136.0f, 32.0f)
                close()
                moveTo(88.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(80.0f, 112.0f)
                lineTo(72.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 112.0f)
                verticalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 160.0f)
                close()
                moveTo(184.0f, 168.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -89.56f, 24.0f)
                lineTo(136.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(152.0f, 96.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(184.0f, 80.0f)
                lineTo(168.0f, 80.0f)
                arcToRelative(39.89f, 39.89f, 0.0f, false, false, 7.6f, -29.6f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 184.0f, 80.0f)
                close()
                moveTo(216.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -16.36f, 22.75f)
                arcTo(62.76f, 62.76f, 0.0f, false, false, 200.0f, 168.0f)
                lineTo(200.0f, 96.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return `_microsoft-teams-logo-fill`!!
    }

private var `_microsoft-teams-logo-fill`: ImageVector? = null
