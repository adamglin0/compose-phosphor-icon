package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) {
            return _escalatorUp!!
        }
        _escalatorUp = Builder(name = "EscalatorUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 40.0f)
                lineTo(168.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.88f, 2.57f)
                lineTo(68.5f, 144.0f)
                lineTo(32.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(88.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.88f, -2.57f)
                lineTo(187.5f, 112.0f)
                lineTo(224.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 40.0f)
                close()
                moveTo(224.0f, 96.0f)
                lineTo(184.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.88f, 2.57f)
                lineTo(84.5f, 200.0f)
                lineTo(32.0f, 200.0f)
                lineTo(32.0f, 160.0f)
                lineTo(72.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.88f, -2.57f)
                lineTo(171.5f, 56.0f)
                lineTo(224.0f, 56.0f)
                close()
                moveTo(229.66f, 170.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(208.0f, 171.31f)
                lineTo(208.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(192.0f, 171.31f)
                lineToRelative(-10.34f, 10.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                close()
            }
        }
        .build()
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null
