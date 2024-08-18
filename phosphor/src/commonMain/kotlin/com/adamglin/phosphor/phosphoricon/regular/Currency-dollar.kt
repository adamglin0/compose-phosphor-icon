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

public val RegularGroup.`Currency-dollar`: ImageVector
    get() {
        if (`_currency-dollar` != null) {
            return `_currency-dollar`!!
        }
        `_currency-dollar` = Builder(name = "Currency-dollar", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 120.0f)
                lineTo(136.0f, 120.0f)
                lineTo(136.0f, 56.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, -48.0f, -48.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(136.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 40.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, 96.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(64.0f)
                lineTo(104.0f, 200.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 216.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, -96.0f)
                close()
                moveTo(112.0f, 120.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -64.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(152.0f, 200.0f)
                lineTo(136.0f, 200.0f)
                lineTo(136.0f, 136.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return `_currency-dollar`!!
    }

private var `_currency-dollar`: ImageVector? = null
