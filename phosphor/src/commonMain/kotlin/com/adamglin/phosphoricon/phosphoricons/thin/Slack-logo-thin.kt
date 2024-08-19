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

public val ThinGroup.`Slack-logo-thin`: ImageVector
    get() {
        if (`_slack-logo-thin` != null) {
            return `_slack-logo-thin`!!
        }
        `_slack-logo-thin` = Builder(name = "Slack-logo-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.4f, 128.0f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 180.0f, 84.43f)
                lineTo(180.0f, 56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -52.0f, -14.4f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 84.43f, 76.0f)
                lineTo(56.0f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -14.4f, 52.0f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 76.0f, 171.57f)
                lineTo(76.0f, 200.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 52.0f, 14.41f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 171.57f, 180.0f)
                lineTo(200.0f, 180.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 14.4f, -52.0f)
                close()
                moveTo(76.0f, 152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                lineTo(76.0f, 132.0f)
                close()
                moveTo(124.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                lineTo(84.0f, 152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(124.0f, 124.0f)
                lineTo(56.0f, 124.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -40.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(124.0f, 76.0f)
                lineTo(104.0f, 76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                close()
                moveTo(180.0f, 104.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                lineTo(180.0f, 124.0f)
                close()
                moveTo(132.0f, 56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(132.0f, 124.0f)
                close()
                moveTo(172.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                lineTo(132.0f, 180.0f)
                horizontalLineToRelative(20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 172.0f, 200.0f)
                close()
                moveTo(200.0f, 172.0f)
                lineTo(152.0f, 172.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(132.0f, 132.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f)
                close()
            }
        }
        .build()
        return `_slack-logo-thin`!!
    }

private var `_slack-logo-thin`: ImageVector? = null
