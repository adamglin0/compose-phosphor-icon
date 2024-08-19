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

public val LightGroup.`Git-diff-light`: ImageVector
    get() {
        if (`_git-diff-light` != null) {
            return `_git-diff-light`!!
        }
        `_git-diff-light` = Builder(name = "Git-diff-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(33.52f)
                lineTo(64.93f, 152.44f)
                arcTo(9.93f, 9.93f, 0.0f, false, true, 62.0f, 145.37f)
                verticalLineToRelative(-52.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -12.0f, 0.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(21.88f, 21.88f, 0.0f, false, false, 6.44f, 15.56f)
                lineTo(97.52f, 202.0f)
                lineTo(64.0f, 202.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(118.0f, 160.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 112.0f, 154.0f)
                close()
                moveTo(38.0f, 64.0f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 56.0f, 82.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 38.0f, 64.0f)
                close()
                moveTo(206.0f, 162.6f)
                verticalLineToRelative(-52.0f)
                arcToRelative(21.88f, 21.88f, 0.0f, false, false, -6.44f, -15.56f)
                lineTo(158.48f, 54.0f)
                lineTo(192.0f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(144.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(138.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(150.0f, 62.48f)
                lineToRelative(41.07f, 41.08f)
                arcToRelative(9.93f, 9.93f, 0.0f, false, true, 2.93f, 7.07f)
                verticalLineToRelative(52.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(200.0f, 210.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 200.0f, 210.0f)
                close()
            }
        }
        .build()
        return `_git-diff-light`!!
    }

private var `_git-diff-light`: ImageVector? = null
