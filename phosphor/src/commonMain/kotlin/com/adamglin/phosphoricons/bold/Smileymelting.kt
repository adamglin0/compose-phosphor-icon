package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.SmileyMelting: ImageVector
    get() {
        if (_smileyMelting != null) {
            return _smileyMelting!!
        }
        _smileyMelting = Builder(name = "SmileyMelting", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 136.0f)
                close()
                moveTo(136.0f, 92.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 136.0f, 92.0f)
                close()
                moveTo(203.83f, 51.1f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 47.5f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.89f, -16.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 125.22f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.89f, 16.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, -4.67f, -148.9f)
                close()
                moveTo(140.0f, 164.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-19.81f, 0.0f, -44.0f, -16.61f, -44.0f, -36.0f)
                arcToRelative(36.47f, 36.47f, 0.0f, false, true, 0.5f, -6.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.67f, -4.0f)
                arcTo(60.67f, 60.67f, 0.0f, false, false, 68.0f, 128.0f)
                curveToRelative(0.0f, 16.1f, 8.0f, 31.46f, 22.49f, 43.25f)
                curveTo(103.58f, 181.9f, 120.17f, 188.0f, 136.0f, 188.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(100.0f, 204.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _smileyMelting!!
    }

private var _smileyMelting: ImageVector? = null
