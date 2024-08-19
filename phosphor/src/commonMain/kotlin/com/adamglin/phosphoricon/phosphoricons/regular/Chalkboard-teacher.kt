package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Chalkboard-teacher`: ImageVector
    get() {
        if (`_chalkboard-teacher` != null) {
            return `_chalkboard-teacher`!!
        }
        `_chalkboard-teacher` = Builder(name = "Chalkboard-teacher", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(53.39f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.23f, -4.57f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 86.76f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.23f, 4.57f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(80.0f, 144.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 80.0f, 144.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(159.43f, 200.0f)
                arcToRelative(64.39f, 64.39f, 0.0f, false, false, -28.83f, -26.16f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -53.2f, 0.0f)
                arcTo(64.39f, 64.39f, 0.0f, false, false, 48.57f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 56.0f)
                lineTo(216.0f, 56.0f)
                close()
                moveTo(56.0f, 96.0f)
                lineTo(56.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(192.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(176.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(184.0f, 88.0f)
                lineTo(72.0f, 88.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_chalkboard-teacher`!!
    }

private var `_chalkboard-teacher`: ImageVector? = null
