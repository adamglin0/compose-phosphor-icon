package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Git-merge`: ImageVector
    get() {
        if (`_git-merge` != null) {
            return `_git-merge`!!
        }
        `_git-merge` = Builder(name = "Git-merge", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 112.0f)
                arcToRelative(32.05f, 32.05f, 0.0f, false, false, -30.69f, 23.0f)
                lineToRelative(-42.21f, -6.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.95f, -2.71f)
                lineTo(94.43f, 84.55f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 72.0f, 87.0f)
                verticalLineToRelative(82.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 16.0f, 0.0f)
                lineTo(88.0f, 101.63f)
                lineToRelative(30.0f, 35.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 14.83f, 8.14f)
                lineToRelative(44.0f, 6.28f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 208.0f, 112.0f)
                close()
                moveTo(64.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 80.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 56.0f)
                close()
                moveTo(96.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 200.0f)
                close()
                moveTo(208.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 160.0f)
                close()
            }
        }
        .build()
        return `_git-merge`!!
    }

private var `_git-merge`: ImageVector? = null
