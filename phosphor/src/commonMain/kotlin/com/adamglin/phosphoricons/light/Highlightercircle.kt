package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) {
            return _highlighterCircle!!
        }
        _highlighterCircle = Builder(name = "HighlighterCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.12f, 55.87f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 55.88f, 200.12f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 200.12f, 55.87f)
                close()
                moveTo(94.0f, 211.37f)
                lineTo(94.0f, 152.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(59.37f)
                arcToRelative(90.49f, 90.49f, 0.0f, false, true, -68.0f, 0.0f)
                close()
                moveTo(146.0f, 138.0f)
                lineTo(110.0f, 138.0f)
                lineTo(110.0f, 99.71f)
                lineToRelative(36.0f, -18.0f)
                close()
                moveTo(191.64f, 191.64f)
                horizontalLineToRelative(0.0f)
                arcTo(90.93f, 90.93f, 0.0f, false, true, 174.0f, 205.39f)
                lineTo(174.0f, 152.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(158.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.68f, -5.37f)
                lineToRelative(-48.0f, 24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 98.0f, 96.0f)
                verticalLineToRelative(42.0f)
                lineTo(96.0f, 138.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(53.39f)
                arcToRelative(90.93f, 90.93f, 0.0f, false, true, -17.64f, -13.75f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 127.28f, 0.0f)
                close()
            }
        }
        .build()
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
