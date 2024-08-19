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

public val BoldGroup.Arrowsin: ImageVector
    get() {
        if (_arrowsin != null) {
            return _arrowsin!!
        }
        _arrowsin = Builder(name = "Arrowsin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 104.0f)
                lineTo(140.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(164.0f, 75.0f)
                lineToRelative(35.51f, -35.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(181.0f, 92.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(152.0f, 116.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 104.0f)
                close()
                moveTo(104.0f, 140.0f)
                lineTo(64.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(75.0f, 164.0f)
                lineTo(39.51f, 199.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineTo(92.0f, 181.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(116.0f, 152.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 104.0f, 140.0f)
                close()
                moveTo(181.0f, 164.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(152.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(164.0f, 181.0f)
                lineToRelative(35.51f, 35.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                close()
                moveTo(104.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 64.0f)
                lineTo(92.0f, 75.0f)
                lineTo(56.49f, 39.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(75.0f, 92.0f)
                lineTo(64.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(116.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 104.0f, 52.0f)
                close()
            }
        }
        .build()
        return _arrowsin!!
    }

private var _arrowsin: ImageVector? = null
