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

public val BoldGroup.`Git-pull-request-bold`: ImageVector
    get() {
        if (`_git-pull-request-bold` != null) {
            return `_git-pull-request-bold`!!
        }
        `_git-pull-request-bold` = Builder(name = "Git-pull-request-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.0f, 64.0f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 60.0f, 97.94f)
                verticalLineToRelative(60.12f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 24.0f, 0.0f)
                lineTo(84.0f, 97.94f)
                arcTo(36.07f, 36.07f, 0.0f, false, false, 108.0f, 64.0f)
                close()
                moveTo(72.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 60.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 52.0f)
                close()
                moveTo(72.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 204.0f)
                close()
                moveTo(212.0f, 158.06f)
                lineTo(212.0f, 110.63f)
                arcToRelative(27.81f, 27.81f, 0.0f, false, false, -8.2f, -19.8f)
                lineTo(173.0f, 60.0f)
                horizontalLineToRelative(19.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(144.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(132.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(156.0f, 77.0f)
                lineToRelative(30.83f, 30.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, 2.83f)
                verticalLineToRelative(47.43f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 24.0f, 0.0f)
                close()
                moveTo(200.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 204.0f)
                close()
            }
        }
        .build()
        return `_git-pull-request-bold`!!
    }

private var `_git-pull-request-bold`: ImageVector? = null
