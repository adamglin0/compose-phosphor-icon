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

public val DuotoneGroup.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) {
            return _paperPlaneTilt!!
        }
        _paperPlaneTilt = Builder(name = "PaperPlaneTilt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(223.69f, 42.18f)
                lineToRelative(-58.22f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.92f, 1.25f)
                lineTo(108.0f, 148.0f)
                lineTo(20.58f, 105.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.25f, -14.92f)
                lineToRelative(192.0f, -58.22f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 223.69f, 42.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.32f, 28.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.66f, -4.08f)
                lineToRelative(-0.15f, 0.0f)
                lineTo(19.57f, 82.84f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.49f, 29.8f)
                lineTo(102.0f, 154.0f)
                lineToRelative(41.3f, 84.87f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 157.74f, 248.0f)
                quadToRelative(0.69f, 0.0f, 1.38f, -0.06f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, 14.0f, -11.51f)
                lineToRelative(58.2f, -191.94f)
                curveToRelative(0.0f, -0.05f, 0.0f, -0.1f, 0.0f, -0.15f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 227.32f, 28.68f)
                close()
                moveTo(157.83f, 231.85f)
                lineToRelative(-0.05f, 0.14f)
                lineToRelative(0.0f, -0.07f)
                lineToRelative(-40.06f, -82.3f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f)
                lineToRelative(-48.0f, 48.0f)
                lineTo(24.08f, 98.25f)
                lineToRelative(-0.07f, 0.0f)
                lineToRelative(0.14f, 0.0f)
                lineTo(216.0f, 40.0f)
                close()
            }
        }
        .build()
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
