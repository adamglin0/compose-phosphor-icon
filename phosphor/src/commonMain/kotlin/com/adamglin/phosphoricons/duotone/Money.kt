package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = Builder(name = "Money", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 128.0f)
                close()
                moveTo(200.0f, 64.0f)
                arcToRelative(48.85f, 48.85f, 0.0f, false, false, 40.0f, 40.0f)
                lineTo(240.0f, 64.0f)
                close()
                moveTo(200.0f, 192.0f)
                horizontalLineToRelative(40.0f)
                lineTo(240.0f, 152.0f)
                arcTo(48.85f, 48.85f, 0.0f, false, false, 200.0f, 192.0f)
                close()
                moveTo(16.0f, 152.0f)
                verticalLineToRelative(40.0f)
                lineTo(56.0f, 192.0f)
                arcTo(48.85f, 48.85f, 0.0f, false, false, 16.0f, 152.0f)
                close()
                moveTo(16.0f, 104.0f)
                arcTo(48.85f, 48.85f, 0.0f, false, false, 56.0f, 64.0f)
                lineTo(16.0f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 128.0f, 88.0f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 152.0f)
                close()
                moveTo(240.0f, 56.0f)
                lineTo(16.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(8.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(240.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(248.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 56.0f)
                close()
                moveTo(24.0f, 72.0f)
                lineTo(45.37f, 72.0f)
                arcTo(40.81f, 40.81f, 0.0f, false, true, 24.0f, 93.37f)
                close()
                moveTo(24.0f, 184.0f)
                lineTo(24.0f, 162.63f)
                arcTo(40.81f, 40.81f, 0.0f, false, true, 45.37f, 184.0f)
                close()
                moveTo(232.0f, 184.0f)
                lineTo(210.63f, 184.0f)
                arcTo(40.81f, 40.81f, 0.0f, false, true, 232.0f, 162.63f)
                close()
                moveTo(232.0f, 145.65f)
                arcTo(56.78f, 56.78f, 0.0f, false, false, 193.65f, 184.0f)
                lineTo(62.35f, 184.0f)
                arcTo(56.78f, 56.78f, 0.0f, false, false, 24.0f, 145.65f)
                verticalLineToRelative(-35.3f)
                arcTo(56.78f, 56.78f, 0.0f, false, false, 62.35f, 72.0f)
                horizontalLineToRelative(131.3f)
                arcTo(56.78f, 56.78f, 0.0f, false, false, 232.0f, 110.35f)
                close()
                moveTo(232.0f, 93.37f)
                arcTo(40.81f, 40.81f, 0.0f, false, true, 210.63f, 72.0f)
                lineTo(232.0f, 72.0f)
                close()
            }
        }
        .build()
        return _money!!
    }

private var _money: ImageVector? = null
