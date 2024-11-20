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

public val DuotoneGroup.Pants: ImageVector
    get() {
        if (_pants != null) {
            return _pants!!
        }
        _pants = Builder(name = "Pants", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(202.05f, 104.0f)
                curveToRelative(-0.68f, 0.0f, -1.36f, 0.0f, -2.05f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f)
                horizontalLineTo(96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                curveToRelative(-0.69f, 0.0f, -1.37f, 0.0f, -2.0f, 0.0f)
                lineTo(62.06f, 39.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 70.0f, 32.0f)
                horizontalLineTo(186.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.94f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.88f, 214.0f)
                lineToRelative(-22.0f, -176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 186.0f, 24.0f)
                lineTo(70.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 54.12f, 38.0f)
                lineToRelative(-22.0f, 176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 232.0f)
                lineTo(88.69f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.51f, -12.06f)
                lineToRelative(23.8f, -92.0f)
                lineToRelative(23.79f, 91.94f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 167.31f, 232.0f)
                lineTo(208.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.88f, -18.0f)
                close()
                moveTo(192.9f, 95.2f)
                arcTo(32.13f, 32.13f, 0.0f, false, true, 169.0f, 72.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(186.0f, 40.0f)
                lineToRelative(2.0f, 16.0f)
                lineTo(68.0f, 56.0f)
                lineToRelative(2.0f, -16.0f)
                close()
                moveTo(66.0f, 72.0f)
                lineTo(87.0f, 72.0f)
                arcTo(32.13f, 32.13f, 0.0f, false, true, 63.1f, 95.2f)
                close()
                moveTo(88.69f, 216.0f)
                lineTo(48.0f, 216.0f)
                lineTo(61.0f, 111.73f)
                arcTo(48.08f, 48.08f, 0.0f, false, false, 103.32f, 72.0f)
                lineTo(120.0f, 72.0f)
                lineTo(120.0f, 95.0f)
                close()
                moveTo(167.29f, 215.94f)
                lineTo(136.0f, 95.0f)
                lineTo(136.0f, 72.0f)
                horizontalLineToRelative(16.68f)
                arcTo(48.08f, 48.08f, 0.0f, false, false, 195.0f, 111.73f)
                lineTo(208.0f, 216.0f)
                close()
            }
        }
        .build()
        return _pants!!
    }

private var _pants: ImageVector? = null
