package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Git-branch-light`: ImageVector
    get() {
        if (`_git-branch-light` != null) {
            return `_git-branch-light`!!
        }
        `_git-branch-light` = Builder(name = "Git-branch-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 64.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -36.0f, 29.4f)
                verticalLineTo(112.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                horizontalLineTo(96.0f)
                arcToRelative(21.84f, 21.84f, 0.0f, false, false, -10.0f, 2.42f)
                verticalLineToRelative(-31.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineToRelative(69.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f)
                verticalLineTo(144.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, -10.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                verticalLineTo(93.4f)
                arcTo(30.05f, 30.05f, 0.0f, false, false, 230.0f, 64.0f)
                close()
                moveTo(62.0f, 64.0f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 80.0f, 82.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 62.0f, 64.0f)
                close()
                moveTo(98.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 98.0f, 192.0f)
                close()
                moveTo(200.0f, 82.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 200.0f, 82.0f)
                close()
            }
        }
        .build()
        return `_git-branch-light`!!
    }

private var `_git-branch-light`: ImageVector? = null
