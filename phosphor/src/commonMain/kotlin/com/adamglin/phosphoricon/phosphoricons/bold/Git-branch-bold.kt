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

public val BoldGroup.`Git-branch-bold`: ImageVector
    get() {
        if (`_git-branch-bold` != null) {
            return `_git-branch-bold`!!
        }
        `_git-branch-bold` = Builder(name = "Git-branch-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -48.0f, 33.94f)
                lineTo(188.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 116.0f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, false, -4.0f, 0.29f)
                lineTo(92.0f, 97.94f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -24.0f, 0.0f)
                verticalLineToRelative(60.12f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 24.0f, 0.0f)
                lineTo(92.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(212.0f, 97.94f)
                arcTo(36.07f, 36.07f, 0.0f, false, false, 236.0f, 64.0f)
                close()
                moveTo(80.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 68.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 52.0f)
                close()
                moveTo(80.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 204.0f)
                close()
                moveTo(200.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 76.0f)
                close()
            }
        }
        .build()
        return `_git-branch-bold`!!
    }

private var `_git-branch-bold`: ImageVector? = null
