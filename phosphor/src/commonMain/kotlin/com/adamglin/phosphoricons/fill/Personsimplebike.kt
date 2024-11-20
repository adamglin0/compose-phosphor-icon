package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.PersonSimpleBike: ImageVector
    get() {
        if (_personSimpleBike != null) {
            return _personSimpleBike!!
        }
        _personSimpleBike = Builder(name = "PersonSimpleBike", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 52.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 136.0f, 52.0f)
                close()
                moveTo(240.0f, 176.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 240.0f, 176.0f)
                close()
                moveTo(224.0f, 176.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 224.0f, 176.0f)
                close()
                moveTo(200.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(155.31f, 104.0f)
                lineTo(125.66f, 74.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineTo(120.0f, 155.31f)
                lineTo(120.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                lineTo(99.31f, 112.0f)
                lineTo(120.0f, 91.31f)
                lineToRelative(26.34f, 26.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 120.0f)
                horizontalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 112.0f)
                close()
                moveTo(96.0f, 176.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 96.0f, 176.0f)
                close()
                moveTo(80.0f, 176.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 80.0f, 176.0f)
                close()
            }
        }
        .build()
        return _personSimpleBike!!
    }

private var _personSimpleBike: ImageVector? = null
